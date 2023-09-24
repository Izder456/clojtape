(ns clojtape.core
  (:gen-class))

;; Translate
(defn transpile-symbol [symbol]
    (if (= symbol "-")
      "0,-,0,-,<"
      (str "0," symbol ",0," symbol ",>")))
      
;; Transpile
(defn transpile-code [code]
  (->> code
       (map (fn [line]
              (->> line
                   (re-seq #"\w+")
                   (map transpile-symbol)
                   (interpose "\n")
                   (apply str))))
        (interpose "\n")))

;; Interpreter REPL
(defn run-interpreter []
  (let [input (atom [])
        trans (atom "")]
    (loop []
      (print "? ")
      (flush)
      (let [line (read-line)]
        (swap! input conj line)
        (if (= line "(done)")
          (do (reset! trans
                (transpile-code @input))
              (println "...")
              (println @trans)
              (reset! input []))
           (recur))))))

;; Main Func
(defn -main
  "Run the interpreter"
  [& args]
  (run-interpreter))

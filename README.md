# clojtape

Clojure Turing Machine

## Options

### Run as interpreter
```
(abcde)
->d
<-a
(done)
```
### Gets transpiled to
```
0,a,0,a,>
0,b,0,b,>
0,c,0,c,>
0,e,0,e,>
0,d,1,d,>
0,-,0,-,>
1,b,1,b,<
1,c,1,c,<
1,d,1,d,<
1,e,1,e,<
1,a,2,a,<
1,-,1,-,<
```
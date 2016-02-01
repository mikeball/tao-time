# tao-time

A readable time library.


## Usage

```clojure
(require '[taoclj.time :as time])

;; Easily add time to current time
(time/now-plus -1 :hours)
(time/now-plus 1 :hours)
(time/now-plus 7 :hours)

(time/now-plus -1 :day)
(time/now-plus 1 :day)
(time/now-plus 7 :days)

=> all return a java instant



; Check for expired dates
(time/has-past (time/now-plus -1 :hours))
=> true


(time/has-past (time/now-plus 1 :hours))
=> false

```



## License

Copyright © 2016 Michael Ball

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

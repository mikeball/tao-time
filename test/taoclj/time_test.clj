(ns taoclj.time-test
  (:require [clojure.test :refer :all]
            [taoclj.time :refer :all]))


(deftest plus-adds
  (are [number units]
       (let [t (now)]
         (= (plus t number units)
            (.plus t (duration units number))))

       1 :hour
       3 :hours
       1 :day
       2 :days ))



(deftest has-past-returns-expected
  (are [number units expected]
       (= expected
          (has-past (now-plus number units)))

       nil :hour nil
       1  :hour false
       -1 :hour true))


;; (run-tests *ns*)

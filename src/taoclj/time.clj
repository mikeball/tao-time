(ns taoclj.time
  (:import [java.time Instant Duration]))


(defn duration [units number]
  (case units

    :day   (Duration/ofDays number)
    :days  (Duration/ofDays number)

    :hour  (Duration/ofHours number)
    :hours (Duration/ofHours number)

    (throw
     (Exception.
      (str units " is not a valid duration! Must be one of :hours or :days")))))
;; (duration :days 4)


(defn plus [point-in-time number units]
  (.plus point-in-time (duration units number)))


(defn now [] (Instant/now))


(defn now-plus [number units]
  (if (and number units)
    (plus (now) number units)))


;; (now-plus 7 :days)



(defn has-past [point-in-time]
  (if point-in-time
    (.isAfter (now) point-in-time)))

;; (has-past (now-plus -1 :hour))
;; (has-past nil)





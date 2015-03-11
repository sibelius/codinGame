(ns codingame.easy.descent
  (:gen-class))

; Auto-generated code below aims at helping you parse
; the standard input according to the problem statement.

(defn -main [& args]
  (while true
    (let [SX (read) 
          SY (read)
          ] ; MH: represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
            
      ; either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
      (loop [i 8]
        (when (> i 0)
          (let [MH (repeatedly 8 read)
                idx (.indexOf MH (apply max MH))
                moves (concat (repeat idx "HOLD") '("FIRE") (repeat (- 7 idx) "HOLD"))]
          (doseq [m moves]
            (println m))
          (recur (dec i))))))))

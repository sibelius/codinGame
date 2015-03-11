(ns codingame.easy.onboarding
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (while true
    (let [enemy1 (read) dist1 (read) enemy2 (read) dist2 (read)]
      ;(if (< dist1 dist2) (println enemy1) (println enemy2))
      (cond
        (< dist1 dist2) (println enemy1)
        :else (println enemy2)))))

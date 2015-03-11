(ns codingame.easy.thor
  (:gen-class))

(defn -main [& args]
  (let [LX (read) LY (read) TX (read) TY (read)]
    ; LX: the X position of the light of power
    ; LY: the Y position of the light of power
    ; TX: Thor's starting X position
    ; TY: Thor's starting Y position
    (while true
      (let [E (read)]
        ; E: The level of Thor's remaining energy, representing the number of moves he can still make.
        
        ; (binding [*out* *err*]
        ;   (println "Debug messages..."))
        
        ; A single line providing the move to be made: N NE E SE S SW W or NW
        ))))

(ns delta-blue.views.welcome
  (:require [delta-blue.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/" []
         (common/layout
          [:div#fading-square
           ]))



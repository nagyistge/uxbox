;; This Source Code Form is subject to the terms of the Mozilla Public
;; License, v. 2.0. If a copy of the MPL was not distributed with this
;; file, You can obtain one at http://mozilla.org/MPL/2.0/.
;;
;; Copyright (c) 2015-2016 Andrey Antukh <niwi@niwi.nz>
;; Copyright (c) 2015-2016 Juan de la Cruz <delacruzgarciajuan@gmail.com>

(ns uxbox.main.constants)

(def ^:const grid-x-axis 10)
(def ^:const grid-y-axis 10)

(def ^:const viewport-width 4000)
(def ^:const viewport-height 4000)

(def ^:const canvas-start-x 1200)
(def ^:const canvas-start-y 1200)
(def ^:const canvas-scroll-padding 50)
(def ^:const canvas-start-scroll-x (- canvas-start-x canvas-scroll-padding))
(def ^:const canvas-start-scroll-y (- canvas-start-y canvas-scroll-padding))


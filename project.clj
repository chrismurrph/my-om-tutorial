(defproject om-tutorial "0.1.0-SNAPSHOT"
  :description "My first Om program!"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]
                 [org.omcljs/om "1.0.0-alpha24"]
                 [cljsjs/react "0.14.3-0"]
                 [cljsjs/react-dom "0.14.3-1"]
                 [com.cognitect/transit-cljs "0.8.237"]
                 [figwheel-sidecar "0.5.0-SNAPSHOT" :scope "test"]]
  :clean-targets ^{:protect false} [:target-path :compile-path "resources/public/js"])
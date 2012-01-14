(defproject jkaditz/loom "0.1.0"
  :description "Graph library for Clojure"
  :author "Justin Kramer"
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :dev-dependencies [[swank-clojure "1.3.0-SNAPSHOT"]
                     [lein-ring "0.4.5"]]
  :jvm-opts ["-Xmx1g" "-Djava.library.path=/usr/local/lib:/opt/local/lib:/usr/lib"]
  :uberjar-exclusions [#"META-INF.*"]
  :javac-options {:debug "true" :fork "true"}
  :aot :all
  :main loom.core
  )

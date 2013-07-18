(defproject lein-daemon "0.5.4-inoft"
  :description "A lein plugin that daemonizes a clojure process"
  :url "https://github.com/inoft/lein-daemon"
  :license {:name "Eclipse Public License"}
  :eval-in-leiningen true
  :profiles {:dev
             {:dependencies
              [[bond "0.2.3" :exclusions [org.clojure/clojure]]]}}
  :deploy-repositories [["releases" {:url ~(str "file:///" (System/getenv "INOFT_PUBLIC_REPO_PATH") "/releases")
                                     :username "john"
                                     :password "doh"
                                     :sign-releases false}
                   		 "snapshots" {:url ~(str "file:///" (System/getenv "INOFT_PUBLIC_REPO_PATH") "/snapshots")
                                      :username "john"
                                      :password "doh"
                                      :sign-releases false}
                      ]]
  )

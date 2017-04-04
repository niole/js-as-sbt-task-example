lazy val nodeScript = TaskKey[Unit]("startNodePackage")

nodeScript := {
  "sh start.sh" !
}

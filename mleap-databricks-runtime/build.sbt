import ml.combust.mleap.{Common, MleapProject}

Common.defaultMleapSettings

packageBin in Compile := (assembly in (MleapProject.databricksRuntimeFat, Compile)).value

publishMavenStyle := true
publishTo := {
    Some("Databricks Repository on S3" at "s3://databricks-build-artifacts-staging/release")
}

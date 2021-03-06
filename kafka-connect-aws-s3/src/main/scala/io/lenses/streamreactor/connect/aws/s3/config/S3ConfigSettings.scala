
/*
 * Copyright 2020 Lenses.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.lenses.streamreactor.connect.aws.s3.config

import com.datamountaineer.streamreactor.connect.config.base.const.TraitConfigConst.{KCQL_PROP_SUFFIX, PROGRESS_ENABLED_CONST}

object S3ConfigSettings {

  val CONNECTOR_PREFIX = "connect.s3"

  val AWS_ACCESS_KEY: String = "aws.access.key"
  val AWS_SECRET_KEY: String = "aws.secret.key"
  val AUTH_MODE: String = "aws.auth.mode"
  val CUSTOM_ENDPOINT: String = "aws.custom.endpoint"
  val ENABLE_VIRTUAL_HOST_BUCKETS: String = "aws.vhost.bucket"

  val KcqlKey = s"$CONNECTOR_PREFIX.$KCQL_PROP_SUFFIX"
  val KCQL_CONFIG = s"$CONNECTOR_PREFIX.$KCQL_PROP_SUFFIX"
  val KCQL_DOC = "Contains the Kafka Connect Query Language describing the flow from Apache Kafka topics to Apache Hive tables."
  val KCQL_DISPLAY = "KCQL commands"

  val PROGRESS_COUNTER_ENABLED: String = PROGRESS_ENABLED_CONST
  val PROGRESS_COUNTER_ENABLED_DOC = "Enables the output for how many records have been processed"
  val PROGRESS_COUNTER_ENABLED_DEFAULT = false
  val PROGRESS_COUNTER_ENABLED_DISPLAY = "Enable progress counter"

}

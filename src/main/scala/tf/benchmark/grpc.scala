package tf.benchmark

object grpc {

  type GrpcCheck = Check[GeneratedMessage]

  val GrpcStringExtender: Extender[GrpcCheck, GeneratedMessage] = (check: GrpcCheck) => check

  val GrpcStringPreparer: Preparer[String, String] = (result: String) => Success(result)
}

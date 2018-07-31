package tf.benchmark.checks

trait GrpcCheckSupport {

  def customCheck: GrpcCustomCheck.type = GrpcCustomCheck

}

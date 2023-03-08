def call() {
  def props = new Properties()
  def propsFile = new File(filePath)
  props.load(propsFile.newDataInputStream())
  return props
}

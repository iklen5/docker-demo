def call(String filepath) {
  def props = new Properties()
  def file = new File(filepath)
  props.load(file.newDataInputStream())
  return props
}
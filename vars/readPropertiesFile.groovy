def call(String filePath) {
  def props = new Properties()
  props.load(new FileInputStream(filePath))
  return props
}
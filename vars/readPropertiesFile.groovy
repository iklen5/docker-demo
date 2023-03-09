def call(String filepath) {
  def props = new Properties()
  def file = new File(filepath)
  props.load(file.newDataInputStream())
  props.each { prop ->
    String key = prop.key
    String value = prop.value
    env."${key}" = value
  }
}
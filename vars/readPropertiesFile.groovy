package org.example

def loadPropertiesFile(GString filePath) {
  def props = new Properties()
  def file = new File(filePath)
  props.load(file.newDataInputStream())
  return props
}

def myLibrary() {
  def props = loadPropertiesFile("${WORKSPACE}/misc/config.properties")

  props.each { prop ->
    String key = prop.key
    String value = prop.value

    env."${key}" = value
  }
}
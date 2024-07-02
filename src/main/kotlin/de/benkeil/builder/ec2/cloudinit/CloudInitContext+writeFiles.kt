package de.benkeil.builder.ec2.cloudinit

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonValue

@CloudInitLanguageDsl
class WriteFilesContext {
  private var writeFiles: MutableList<WriteFile>? = null

  fun file(
      /** Path of the file to which content is decoded and written. */
      path: String,
      /**
       * Optional content to write to the provided path. When content is present and encoding is not
       * ‘text/plain’, decode the content prior to writing. Default: ''
       */
      content: String? = null,
      /** Optional owner:group to chown on the file and new directories. Default: root:root */
      owner: Owner? = null,
      /**
       * Optional file permissions to set on path represented as an octal string ‘0###’. Default:
       * 0o644
       */
      permissions: String? = null,
      /**
       * Optional encoding type of the content. Default: text/plain. No decoding is performed by
       * default. Supported encoding types are: gz, gzip, gz+base64, gzip+base64, gz+b64, gzip+b64,
       * b64, base64
       */
      encoding: FileEncoding? = null,
      /** Whether to append content to existing file if path exists. Default: false */
      append: Boolean? = null,
      /**
       * Defer writing the file until ‘final’ stage, after users were created, and packages were
       * installed. Default: false
       */
      defer: Boolean? = null,
  ): WriteFilesContext {
    if (writeFiles == null) {
      writeFiles = mutableListOf()
    }
    writeFiles!!.add(
        WriteFile(
            path = path,
            content = content,
            owner = owner?.let { "${it.owner}:${it.group}" },
            permissions = permissions,
            encoding = encoding,
            append = append,
            defer = defer,
        ))
    return this
  }

  fun build(): List<WriteFile>? {
    return writeFiles
  }
}

class Owner(val owner: String, val group: String = owner)

enum class FileEncoding(@JsonValue val value: String) {
  gz("gz"),
  gzip("gzip"),
  gz_base64("gz+base64"),
  gzip_base64("gzip+base64"),
  gz_b64("gz+b64"),
  gzip_b64("gzip+b64"),
  b64("b64"),
  base64("base64"),
  text_plain("text/plain"),
}

@JsonInclude(JsonInclude.Include.NON_NULL)
data class WriteFile(
    /** Path of the file to which content is decoded and written. */
    val path: String,
    /**
     * Optional content to write to the provided path. When content is present and encoding is not
     * ‘text/plain’, decode the content prior to writing. Default: ''
     */
    val content: String? = null,
    /** Optional owner:group to chown on the file and new directories. Default: root:root */
    val owner: String? = null,
    /**
     * Optional file permissions to set on path represented as an octal string ‘0###’. Default:
     * 0o644
     */
    val permissions: String? = null,
    /**
     * Optional encoding type of the content. Default: text/plain. No decoding is performed by
     * default. Supported encoding types are: gz, gzip, gz+base64, gzip+base64, gz+b64, gzip+b64,
     * b64, base64
     */
    val encoding: FileEncoding? = null,
    /** Whether to append content to existing file if path exists. Default: false */
    val append: Boolean? = null,
    /**
     * Defer writing the file until ‘final’ stage, after users were created, and packages were
     * installed. Default: false
     */
    val defer: Boolean? = null,
)

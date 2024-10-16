下面是Java IO流中一些常见子类的特点以及它们特有的方法总结：

### 字节输入流（InputStream）

#### ByteArrayInputStream

- 特点：允许内存中的缓冲区作为InputStream使用。
- 特有方法：
  - `reset()`: 重置缓冲区，即将位置设回为缓冲区的开始位置。

#### FileInputStream

- 特点：用于从文件系统中的文件获取输入字节。
- 特有方法：
  - `getChannel()`: 返回与此文件输入流相关联的唯一的FileChannel对象。
  - `getFileDescriptor()`: 返回表示到文件系统中实际文件的连接的FileDescriptor对象。

#### BufferedInputStream

- 特点：使用缓冲区来提高输入流读取效率。
- 特有方法：
  - `mark(int readlimit)`: 在此输入流中标记当前的位置。
  - `reset()`: 将此流重新定位到最后一次对此输入流调用mark方法时的位置。

### 字节输出流（OutputStream）

#### ByteArrayOutputStream

- 特点：在内存中创建缓冲区，所有送往流的字节都存储在此缓冲区中。
- 特有方法：
  - `size()`: 返回缓冲区的当前大小。
  - `toString()`: 将缓冲区内容转换为字符串。

#### FileOutputStream

- 特点：用于将数据写入文件系统中的文件。
- 特有方法：
  - `getChannel()`: 返回与此文件输出流相关联的唯一的FileChannel对象。
  - `getFileDescriptor()`: 返回与此流关联的FileDescriptor对象。

#### BufferedOutputStream

- 特点：使用缓冲区来提高输出流写入效率。
- 特有方法：
  - 无特有的方法，但继承自FilterOutputStream。

### 字符输入流（Reader）

#### InputStreamReader

- 特点：是从字节流到字符流的桥梁。
- 特有方法：
  - `getEncoding()`: 返回此流使用的字符编码的名称。

#### FileReader

- 特点：用于从文件系统中的文件读取文本数据。
- 特有方法：
  - 无特有的方法，但继承自InputStreamReader。

#### BufferedReader

- 特点：提供缓冲功能，可以按行读取文本数据。
- 特有方法：
  - `readLine()`: 读取一个文本行。

### 字符输出流（Writer）

#### OutputStreamWriter

- 特点：是从字符流到字节流的桥梁。
- 特有方法：
  - `getEncoding()`: 返回此流使用的字符编码的名称。

#### FileWriter

- 特点：用于向文件系统中的文件写入文本数据。
- 特有方法：
  - 无特有的方法，但继承自OutputStreamWriter。

#### BufferedWriter

- 特点：提供缓冲功能，可以按行写入文本数据。
- 特有方法：
  - `newLine()`: 写入一个行分隔符。

### 数据输入/输出流（DataInputStream/DataOutputStream）

#### DataInputStream

- 特点：用于读取原始Java数据类型。
- 特有方法：
  - `readUTF()`: 读取使用UTF-8修改版格式的字符串。

#### DataOutputStream

- 特点：用于写入原始Java数据类型。
- 特有方法：
  - `writeUTF(String str)`: 写入使用UTF-8修改版格式的字符串。

### 对象输入/输出流（ObjectInputStream/ObjectOutputStream）

#### ObjectInputStream

- 特点：用于对象的反序列化。
- 特有方法：
  - `readObject()`: 从ObjectInputStream读取一个对象。

#### ObjectOutputStream

- 特点：用于对象的序列化。
- 特有方法：
  - `writeObject(Object obj)`: 将指定的对象写入ObjectOutputStream。

### PrintStream/PrintWriter

#### PrintStream

- 特点：用于方便地打印各种数据类型的值。
- 特有方法：
  - `printf(String format, Object... args)`: 使用指定的格式字符串和参数打印一个格式化的字符串。

#### PrintWriter

- 特点：用于方便地打印各种数据类型的值。
- 特有方法：
  - `printf(String format, Object... args)`: 使用指定的格式字符串和参数打印一个格式化的字符串。
  - `format(String format, Object... args)`: 使用指定的格式字符串和参数执行格式化输出。
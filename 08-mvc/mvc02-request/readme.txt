SpringMVC中的文件上传
1.由于SpringMVC使用 commons-fileupload 实现文件上传，
    需要依赖 commons-fileupload 和 commons-io
2. 配置 MultipartResolver bean，可处理上传文件
3. 在Controller的方法中添加 MultipartFile 类型的参数，用来接收文件。
4. jsp 表单增加 enctype="multipart/form-data"
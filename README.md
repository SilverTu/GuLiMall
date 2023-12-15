# GuLiMall
谷粒商城

## fast-vue环境搭建

os: windows10 22h2

[nodejs](https://nodejs.org/download/release/v10.16.3/): 10.16.3

[python](https://www.python.org/downloads/windows/): 3.9.1(~~当前最新版本3.12.1不兼容~~)

VC++: 2017

[set-ExecutionPolicy](https://blog.csdn.net/abaidaye/article/details/121281454)
```powershell
set-ExecutionPolicy RemoteSigned
y
```

[operation not permitted](https://blog.csdn.net/qq_39006954/article/details/130632763)

[ali-mirror](https://developer.aliyun.com/mirror/NPM)

[chromedriver_filepath](https://blog.csdn.net/u014708644/article/details/127946338)

```bash
npm config set prefix "D:\nodejs\node_global"
npm config set cache "D:\nodejs\node_cache"

npm install -g cnpm@7.1.0 --registry=http://registry.npmmirror.com

cnpm install --chromedriver_filepath=D:\chromedriver_win32.zip
```
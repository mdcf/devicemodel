IF NOT DEFINED JAVA_HEAP_SIZE (
  SET JAVA_HEAP_SIZE=2048m
)
IF NOT DEFINED MAX_PERM_SIZE (
  SET MAX_PERM_SIZE=512m
)
IF NOT DEFINED RESERVED_CODE_CACHE_SIZE (
  SET RESERVED_CODE_CACHE_SIZE=300m
)
set PROJECT_DIR=%~dp0\..\..
set SBT_DIR=%PROJECT_DIR%\sbt
java -Dfile.encoding=UTF8 %JAVA_OPTS% -XX:ReservedCodeCacheSize=%RESERVED_CODE_CACHE_SIZE% -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=%MAX_PERM_SIZE% -Xmx%JAVA_HEAP_SIZE% -jar %PROJECT_DIR%\tools\bin\sbt-launch-0.13.0-SNAPSHOT.jar %SBT_OPTS% %*
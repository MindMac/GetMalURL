GetMalURL
=============

Show a fast method to get the server's URL from the malicious Xposed plugin reported by [AVL Team](http://blog.avlyun.com/1361.html). 
For a detailed report, refer to [http://www.kanxue.com/bbs/showthread.php?p=1328412#post1328412](http://www.kanxue.com/bbs/showthread.php?p=1328412#post1328412). 


Content
------------
- AndroidTest: Original source code directory
- lib: Libs used by the malicious Xposed plugin
- AndroidTestModified.apk: Final useable application to identify the server's URL

Usage
-----------
1. Create AndroidTest.apk based on AndroidTest source code
2. Unzip the AndroidTest.apk to AndroidTest directory
3. Copy lib folder to AndroidTest directory
4. Zip AndroidTest folder to generate AndroidTestModified_unsigned.apk
5. Sign the AndroidTestModified_unsigned.apk to AndroidTestModified.apk
6. Install and launch AndroidTestModified.apk 
7. adb logcat -s System.out and you will see the results

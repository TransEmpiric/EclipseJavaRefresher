EclipseJava7Refresher
================

Forked from https://github.com/psxpaul/EclipseJava7Refresher.

This is an Eclipse plugin that uses the WatchService in Java to automatically refresh files in your workspace. This is useful if you edit files outside of Eclipse often, and find yourself frequently F5ing your workspace.  Additionally, you may specify directories you want to refresh in the eclipse.ini file.


Installation
================
- Exctract [the zip] into {ECLIPSE_DIRECTORY}/dropins
- Start Eclipse
- Go to Window->Preferences->General->Workspace
- Enable the "Refresh using native hooks or polling" option
- (Optional) if you do not want to refresh every directory in your workspace, specify directories you want to refresh in the eclipse.ini file.
-- Example: -DjavaRefresher.dirs=dist


Normally, the above workspace option can cause performance issues on Linux and OSX, as there is no native hook implementation in Eclipse. This plugin leverages APIs in Java to hook into filesystem changes without polling. The result, is that you see your file changes in realtime in Eclipse, with no performance hit!

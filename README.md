# DropLauncher

## Version 0.5.24a has been released!

* [Download](https://github.com/adakitesystems/DropLauncher/releases)
* [Instructions](INSTRUCTIONS.md)

## Description
DropLauncher is designed to be a simple tool to aid players in setting up and playing **1v1 StarCraft: Brood War** games against any [BWAPI bot](https://github.com/bwapi/bwapi) using **Local Area Network (UDP)** as the connection type. *Optional/Recommended: Make a copy of your StarCraft directory and let DropLauncher use that copy for the BWAPI bot.*

## Licenses
* DropLauncher: [GNU Affero General Public License version 3](https://www.gnu.org/licenses/agpl-3.0.en.html)
* AdakiteLibrary: [The MIT License](https://opensource.org/licenses/MIT)
* bwheadless.exe: [CC0 1.0 Universal](https://github.com/tscmoo/bwheadless/blob/master/LICENSE)

## Supported Software
* **Windows 7** and higher
* StarCraft: Brood War version **1.16.1**
* BWAPI versions **3.7.4** to **4.2.0**
* BWAPI bot types: **module (\*.dll)**, **client (\*.exe, \*.jar)**

## Features
* No installation of DropLauncher required (just extract to any directory)
* No installation of BWAPI required (BWAPI-related files will be auto-extracted to the StarCraft directory)
* 1v1 (Human vs Bot) Melee Mode played over LAN UDP
* Drag-n-drop bot file loading (also allows ZIP files)
* Auto-eject bot after game has ended
* Auto-connect bot to game lobby after eject

## Third-party Libraries/Applications

DropLauncher uses the following third-party libraries and applications:

| Name | Type | Description |
|-|-|-|
| [bwheadless.exe](https://github.com/tscmoo/bwheadless) | Binary | Starts a separate StarCraft instance and injects BWAPI |
| [AdakiteLibrary](https://github.com/adakitesystems/AdakiteLibrary) | Library | Useful general utilities |
| [commons-io-2.5.jar](https://commons.apache.org/proper/commons-io/) | Library | Assists with developing IO functionality
| [zip4j_1.3.2.jar](http://www.lingala.net/zip4j/) | Library | ZIP file support

## FAQ

Q: How do I install DropLauncher?<br/>
A: There is no installation required. Download the latest *.zip file on the [releases page](https://github.com/adakitesystems/DropLauncher/releases) and extract it to any directory.

Q: What do I need to install besides DropLauncher?<br/>
A: Nothing. DropLauncher is designed to include all required runtime files excluding StarCraft: Brood War.

Q: How do I launch StarCraft before playing against a bot?<br/>
A: As long as you can create a Melee game over LAN UDP, you can launch StarCraft using any launcher (e.g. mca64launcher, Chaoslauncher) or no launcher at all.

Q: How do I use DropLauncher to play against a bot?<br/>
A: After you've downloaded and extracted DropLauncher:
1. Create a **Melee** game over **Local Area Network (UDP)** in StarCraft.
2. Run **DropLauncher.exe**.
3. Load a bot by dragging **all bot files** into DropLauncher or by using the **File > Select bot files...** menu option. Bot files may appear as \*.dll, \*.exe, \*.jar, \*.txt, \*.json, etc. files.
4. Press the **Start** button in DropLauncher and the bot should connect to your game.
5. More detailed instructions about running and downloading bots are accessible via the **Help > DropLauncher Help** menu option.

Q: Why does the bot freeze when the game starts?<br/>
A: Some bots use the [BWTA library](https://bitbucket.org/auriarte/bwta2) which is a terrain analyzer. This library allows the bot to read map information before the game starts. Depending on the size of the map and the speed of the computer, this may take up to a few minutes to generate a cache file for the currently selected map. If a cache file for the map is already present, the bot will load the map data almost instantaneously and should not freeze at the start of the game. These cache files are saved to **StarCraft/bwapi-data/BWTA/** and/or **StarCraft/bwapi-data/BWTA2/**.

## Screenshots

![alt tag](https://i.imgur.com/DXylcdQ.png)

![alt tag](https://i.imgur.com/JpO9Lhd.png)

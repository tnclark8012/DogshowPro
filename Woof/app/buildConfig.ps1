$configLocation = [Environment]::GetEnvironmentVariable("Woof_Config_Path","User")
$targetLocation = ".\src\main\res\values\config.xml"
Copy-Item -Path $configLocation -Destination $targetLocation
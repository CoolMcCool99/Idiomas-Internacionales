# Add project specific ProGuard rules here.
# You can find more samples at https://r8.googlesource.com/r8/+/main/compatibility-tool/configs/android-sdk-rules.pro

# R8 rule for BlockHoundIntegration
-keep class reactor.blockhound.integration.BlockHoundIntegration { *; }
-dontwarn reactor.blockhound.integration.BlockHoundIntegration

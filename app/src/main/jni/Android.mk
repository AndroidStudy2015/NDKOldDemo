LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := Java2C
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_SRC_FILES := \
	/Users/apple/AndroidStudioProjects/GoodDemo/NDKOldDemo/app/src/main/jni/Java2C.cpp \

LOCAL_C_INCLUDES += /Users/apple/AndroidStudioProjects/GoodDemo/NDKOldDemo/app/src/debug/jni
LOCAL_C_INCLUDES += /Users/apple/AndroidStudioProjects/GoodDemo/NDKOldDemo/app/src/main/jni

include $(BUILD_SHARED_LIBRARY)

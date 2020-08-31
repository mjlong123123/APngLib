# APnglibrary
Play apng library in android app

#Summary
1.Decode apng with pngj library.
2.Play the apng file as streaming.
3.Do not cache all frames when playing apng.It only cache previous/current/next frames.So it coast less memory.
4.Different ImageVeiw can use shared one APngHolder. One APngHolder hold one apng file.

#How to integrate?

1.Clone APnglibrary as submodule.

[submodule "APngLib"]
	path = APngLib
	url = git@git.linecorp.com:chen-jiulong/APnglibrary.git
  
2.Import APnglibrary

dependencies {
    implementation fileTree(dir: "libs", include: ["*.jar"])
    implementation project(':APngLib')
}

3.Play the apng file in assets

imageView.playAPngAsset(this, "blued.png", object : AnimationCallback {
                override fun onAnimationStart(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationStart ${drawable.file}")
                }
                override fun onAnimationRepeat(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationRepeat ${drawable.file}")
                }
                override fun onAnimationEnd(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationEnd ${drawable.file}")
                }
                override fun onAnimationCanceled(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationCanceled ${drawable.file}")
                }
            })

4.Play the apng file in sdcard

imageView.playAPngFile(this, "mnt/sdcard/entrance1.png", object : AnimationCallback {
                override fun onAnimationStart(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationStart ${drawable.file}")
                }
                override fun onAnimationRepeat(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationRepeat ${drawable.file}")
                }
                override fun onAnimationEnd(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationEnd ${drawable.file}")
                }
                override fun onAnimationCanceled(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationCanceled ${drawable.file}")
                }
            })

5.Play the shared apng file 

private val sharedHolder = APngHolderPool(lifecycle)

imageView.playAPngAsset(this, "blued.png", object : AnimationCallback {
                override fun onAnimationStart(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationStart ${drawable.file}")
                }
                override fun onAnimationRepeat(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationRepeat ${drawable.file}")
                }
                override fun onAnimationEnd(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationEnd ${drawable.file}")
                }
                override fun onAnimationCanceled(drawable: APngDrawable) {
                    Log.d("APngActivity", "onAnimationCanceled ${drawable.file}")
                }
            }, sharedHolder)

6.Stop to play the apng file

imageView.stopAPng()

7.Retart to play the apng file

 imageView.replayAPng()
 
 8.Clear the apng resource binded to the imageView
 
 imageView.clearAPng()
 
 
 



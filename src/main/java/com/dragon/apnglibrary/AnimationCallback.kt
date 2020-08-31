package com.dragon.apnglibrary

/**
 * @author dragon
 */
interface AnimationCallback {
    fun onAnimationStart(drawable: APngDrawable)
    fun onAnimationRepeat(drawable: APngDrawable)
    fun onAnimationEnd(drawable: APngDrawable)
    fun onAnimationCanceled(drawable: APngDrawable)
}
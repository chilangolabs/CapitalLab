package com.chilangolabs.capitallab.OwnElements

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText

/**
 * Created by Gorro on 29/10/16.
 */
class MontSerratEditText : EditText {
    constructor(context: Context) : super(context) {
        FontManager(context).initStyle(this)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        if (!isInEditMode) {
            FontManager(context).initStyle(this, attrs)
        }
    }
}
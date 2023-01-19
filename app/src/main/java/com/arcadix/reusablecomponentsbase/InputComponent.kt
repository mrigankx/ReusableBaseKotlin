package com.arcadix.reusablecomponentsbase
import android.content.Context
import android.text.Editable
import android.text.InputType
import android.util.AttributeSet
import android.widget.EditText
import android.widget.LinearLayout
import com.google.android.material.textfield.TextInputLayout

class InputComponent(context: Context,
                      attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        inflate(context, R.layout.input_component, this)
        val customAttributeStyle = context.obtainStyledAttributes(attrs, R.styleable.CustomComponentLayout, 0, 0)
        val inputbox =findViewById<EditText>(R.id.inputfield)

        try {
            val value = customAttributeStyle.getString(R.styleable.CustomComponentLayout_input_type)
            if(value.toString().lowercase() == "text")
                inputbox.inputType = InputType.TYPE_CLASS_TEXT
            if(value.toString().lowercase() == "password")
                inputbox.inputType =  InputType.TYPE_TEXT_VARIATION_PASSWORD

        } finally {
            customAttributeStyle.recycle()
        }

    }


}
package com.example.longthay.demokotlin

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.longthay.demokotlin.models.KotlinModel

import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    val kotlinModel : KotlinModel = KotlinModel("Long Thay", 30)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        this.etInput.setText(kotlinModel.age.toString())

        btnAdd.setOnClickListener({
            doAdd(etInput.text.toString().toInt(), 10)
        })

        btnMinus.setOnClickListener({
            doMinus(etInput.text.toString().toInt(), 10)
        })

        btnMultiply.setOnClickListener({
            doMultiply(etInput.text.toString().toInt(), 2)
        })

        btnDivide.setOnClickListener({
            doDivide(etInput.text.toString().toInt(), 2)
        })
    }

    fun doAdd(a: Int, b: Int) {
        val total = a + b
        etInput.setText(total.toString())
        kotlinModel.age = total
        tvResult.text = resources.getString(R.string.result, kotlinModel.name, kotlinModel.age)
    }

    fun doMinus(a: Int, b: Int) {
        val total = a - b
        etInput.setText(total.toString())
        kotlinModel.age = total
        tvResult.text = resources.getString(R.string.result, kotlinModel.name, kotlinModel.age)
    }

    fun doMultiply(a: Int, b: Int) {
        val total = a * b
        etInput.setText(total.toString())
        kotlinModel.age = total
        tvResult.text = resources.getString(R.string.result, kotlinModel.name, kotlinModel.age)
    }

    fun doDivide(a: Int, b: Int) {
        val total = a / b
        etInput.setText(total.toString())
        kotlinModel.age = total
        tvResult.text = resources.getString(R.string.result, kotlinModel.name, kotlinModel.age)
    }
}

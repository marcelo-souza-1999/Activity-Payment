package com.marcelo.paymentiti.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marcelo.paymentiti.R
import kotlinx.android.synthetic.main.header_proof_payment.*

class ProofPaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proof_payment)

        clickButtons()
    }

    private fun clickButtons() {
        imageCloseProofPayment.setOnClickListener {
            finish()
        }
    }
}
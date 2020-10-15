package com.nishankumaraarya.expensetracker.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.nishankumaraarya.expensetracker.AddInvestmentActivity;
import com.nishankumaraarya.expensetracker.AddLoanActivity;
import com.nishankumaraarya.expensetracker.R;
import com.nishankumaraarya.expensetracker.ShoppingActivity;
import com.nishankumaraarya.expensetracker.TransferActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;



public class AddTransactionDialog extends DialogFragment {
    private static final String TAG = "AddTransactionDialog";

    private RelativeLayout shopping, investment, loan, transaction;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_add_transaction, null);
        shopping = view.findViewById(R.id.shoppingRelLayout);
        investment = (RelativeLayout) view.findViewById(R.id.investmentRelLayout);
        loan = (RelativeLayout) view.findViewById(R.id.loanRelLayout);
        transaction = (RelativeLayout) view.findViewById(R.id.transactionRelLayout);

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ShoppingActivity.class);
                startActivity(intent);
            }
        });

        investment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddInvestmentActivity.class);
                startActivity(intent);
            }
        });

        loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddLoanActivity.class);
                startActivity(intent);
            }
        });

        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TransferActivity.class);
                startActivity(intent);
            }
        });


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                .setTitle("Add Transaction")
                .setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).setView(view);

        return builder.create();
    }
}

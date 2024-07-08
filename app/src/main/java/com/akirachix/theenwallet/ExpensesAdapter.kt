package com.akirachix.theenwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ListMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ExpensesAdapter(var expenseList: List<ExpensensesData>):
        RecyclerView.Adapter<ExpensesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.expensenses,parent, false)
        return ExpensesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val expense = expenseList[position]
        holder.tvSalary.text = expense.type
        holder.tvAmount.text = expense.money
        holder.tvDate.text = expense.date
    }

    override fun getItemCount(): Int {
        return expenseList.size
    }
}



class ExpensesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}

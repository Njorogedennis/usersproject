package com.example.viewmodel.viewmodels

import androidx.lifecycle.ViewModel
import com.example.viewmodel.models.Student

class StudentViewModel : ViewModel() {

    lateinit var students: MutableList<Student>

    init {
        this.students = mutableListOf()
        this.students.add(Student(
            "I20/1367/2000",
            "Felix Okoth"))
    }

}
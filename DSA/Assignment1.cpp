#include <iostream>
#include <iomanip>
#include <algorithm>
using namespace std;

class Student {
public:
    int rollNo;
    string name;
    float sgpa;

    void getData();
    void showData();
    static void findSGPA(Student s[], int n, float toFind);
    static void rollList(Student s[], int n);
    static void nameList(Student s[], int n);
    static void findName(Student s[], int n, string toFind);
    static void topTen(Student s[], int n);
    static int partition(Student s[], int lb, int ub);
    static void quickSort(Student s[], int lb, int ub);
};

void Student::getData() {
    cout << "Enter Name of Student: ";
    cin >> name;
    cout << "Enter Roll no of Student: ";
    cin >> rollNo;
    cout << "Enter Student SGPA: ";
    cin >> sgpa;
    
}

void Student::showData() {
    cout << "NAME: " << name << "\tRoll no: " << rollNo;
    cout << fixed << setprecision(2) << "\tSGPA: " << sgpa << endl;
}

void Student::findSGPA(Student s[], int n, float toFind) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (s[i].sgpa == toFind) {
            cout << "Student Found: ";
            s[i].showData();
            count++;
        }
    }
    if (count == 0)
        cout << toFind << " SGPA not found." << endl;
}

void Student::rollList(Student s[], int n) {
    sort(s, s + n, [](const Student& a, const Student& b) {
        return a.rollNo < b.rollNo;
    });

    cout << "Sorted Roll Call List:" << endl;
    for (int i = 0; i < n; i++)
        s[i].showData();
    cout << endl;
}

void Student::nameList(Student s[], int n) {
    sort(s, s + n, [](const Student& a, const Student& b) {
        return a.name < b.name;
    });

    cout << "Name List:" << endl;
    for (int i = 0; i < n; i++)
        s[i].showData();
}

void Student::findName(Student s[], int n, string toFind) {
    int f = 0, r = n - 1, mid;
    while (f <= r) {
        mid = (f + r) / 2;

        if (s[mid].name == toFind) {
            cout << "Student Found: ";
            s[mid].showData();
            return;
        } else if (s[mid].name < toFind)
            f = mid + 1;
        else
            r = mid - 1;
    }

    cout << "Not Found" << endl;
}

int Student::partition(Student s[], int lb, int ub) {
    float pivot = s[lb].sgpa;
    int start = lb;
    int end = ub;

    while (start < end) {
        while (s[start].sgpa <= pivot)
            start++;
        while (s[end].sgpa > pivot)
            end--;
        if (start < end) {
            swap(s[start], s[end]);
        }
    }

    swap(s[lb], s[end]);
    return end;
}

void Student::quickSort(Student s[], int lb, int ub) {
    if (lb < ub) {
        int pos = partition(s, lb, ub);
        quickSort(s, lb, pos - 1);
        quickSort(s, pos + 1, ub);
    }
}

void Student::topTen(Student s[], int n) {
    quickSort(s, 0, n - 1);
    cout << "Top Ten Students:" << endl;
    for (int i = max(0, n - 10); i < n; i++)
        s[i].showData();
}

int main() {
    int n;
    cout << "Enter number of students: ";
    cin >> n;
    Student s[n];
    string nameToFind; // Declare nameToFind here

    for (int i = 0; i < n; i++) {
        cout << "Enter data for student " << i + 1 << endl;
        s[i].getData();
    }

    while (true) {
        cout << endl << "**************";
        cout << endl << "\t\t" << "MAIN MENU";
        cout << endl << "**************";
        cout << endl << "| 1. Show Data                  |" << endl;
        cout << "| 2. Search Student by SGPA     |" << endl;
        cout << "| 3. Show Roll List             |" << endl;
        cout << "| 4. Search student by name     |" << endl;
        cout << "| 5. Name List                  |" << endl;
        cout << "| 6. Topper List                |" << endl;
        cout << "| 7. Exit                       |" << endl;
        cout << "**************";
        cout << endl << "Enter your choice: ";
        int m;
        cin >> m;
        cout << "............................................." << endl;

        switch (m) {
            case 1:
                for (int i = 0; i < n; i++)
                    s[i].showData();
                break;
            case 2:
                float toFind;
                cout << "Enter SGPA to search: ";
                cin >> toFind;
                Student::findSGPA(s, n, toFind);
                break;
            case 3:
                Student::rollList(s, n);
                break;
            case 4:
                cout << "Enter Name to search: ";
                cin >> nameToFind;
                Student::findName(s, n, nameToFind);
                break;
            case 5:
                Student::nameList(s, n);
                break;
            case 6:
                Student::topTen(s, n);
                break;
            case 7:
                return 0;
        }
    }
}

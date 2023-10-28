#include <iostream>
#include <stack>
using namespace std;

struct Node {
    char data;
    Node* left;
    Node* right;
    Node(char d) : data(d), left(nullptr), right(nullptr) {}
};

bool isOperator(char c) {
    return (c == '+' || c == '-' || c == '*' || c == '/');
}

Node* constructExpressionTreeFromPostfix(string postfix) {
    stack<Node*> st;
    for (char c : postfix) {
        if (!isOperator(c)) {
            Node* operand = new Node(c);
            st.push(operand);
        } else {
            Node* operatorNode = new Node(c);
            operatorNode->right = st.top();
            st.pop();
            operatorNode->left = st.top();
            st.pop();
            st.push(operatorNode);
        }
    }
    return st.top();
}

void recursiveInorder(Node* root) {
    if (root) {
        recursiveInorder(root->left);
        cout << root->data << " ";
        recursiveInorder(root->right);
    }
}

void recursivePreorder(Node* root) {
    if (root) {
        cout << root->data << " ";
        recursivePreorder(root->left);
        recursivePreorder(root->right);
    }
}

void recursivePostorder(Node* root) {
    if (root) {
        recursivePostorder(root->left);
        recursivePostorder(root->right);
        cout << root->data << " ";
    }
}

int main() {
    string postfixExpression = "ab+ef*g*-";
    Node* root = constructExpressionTreeFromPostfix(postfixExpression);

    cout << "In-order traversal (Recursive): ";
    recursiveInorder(root);
    cout << endl;

    cout << "Pre-order traversal (Recursive): ";
    recursivePreorder(root);
    cout << endl;

    cout << "Post-order traversal (Recursive): ";
    recursivePostorder(root);
    cout << endl;

    return 0;
}

# Library Management System – Mini-Project Brief

## Problem
A small library needs a simple program to maintain books and track whether each book is available or issued.

## Required features
- Add and list books.
- Register members.
- Issue a book to a member only when it is available.
- Return an issued book.
- Display available and issued books.
- Validate IDs and handle invalid operations.

## OOP mapping
- **Encapsulation:** keep book/member data private and expose methods.
- **Inheritance:** optionally define a common `Person` class for `Member` and `Librarian`.
- **Polymorphism:** override role-specific display or operation methods.
- **Abstraction:** define a `LibraryOperations` interface.
- **Collections:** use `Map` or `List` to store records.
- **Exception handling:** report invalid IDs, duplicate records, and unavailable books.

## Suggested extensions
Add a menu-driven console interface, due dates, fine calculation, and file persistence.

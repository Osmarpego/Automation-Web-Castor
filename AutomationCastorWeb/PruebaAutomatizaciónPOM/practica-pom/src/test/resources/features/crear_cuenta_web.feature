@Cucumber
Feature: Validations Orange Platform

  @PlatformOrange @AddUser
  Scenario: Validación de agregar User
    Given Enter the Orange HRM Page with credentials
    When Select PIM module
    And Select add button
    And Fill out the form
    And Select Save Button
    Then I verify successful registration

  @PlatformOrange @EditUser
  Scenario: Validación de editar User
    Given Enter the Orange HRM Page with credentials
    When Select PIM module
    And Find user for employee information
    And Select search button
    And select user to edit
    And edit user fields
    And Select Save Button
    Then I verify successful registration

  @PlatformOrange @DeleteUser
  Scenario: Validación de eliminar User
    Given Enter the Orange HRM Page with credentials
    When Select PIM module
    And Find user for employee information
    And Select search button
    And select user to delete
    And confirm deletion process
    Then verify span with no record found

  @PlatformOrange @FieldValidation
  Scenario: Validación de campos obligatorios
    Given Enter the Orange HRM Page with credentials
    When Select PIM module
    And Select add button
    And Select Save Button
    Then verify span with errors
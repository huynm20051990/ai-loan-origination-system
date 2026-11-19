# User Story: Add Real Estate Property

**ID:** US-PROP-001  
**Epic:** Property Management  
**Priority:** High  
**Status:** Draft  
**Date:** 2026-11-18

---

## User Story

**As a** seller,  
**I want to** add a real estate property to the system,  
**So that** I can list my property as available collateral and provide accurate details to support the buyer's loan application process.

---

## Acceptance Criteria

### AC-1: Access property entry
- Given I am logged in as a seller,
- When I navigate to the **My Properties** section,
- Then I should see an option to add a new property.

### AC-2: Enter property details
- Given I click "Add Property",
- When the property form opens,
- Then I should be able to enter:
  - Property address (street, city, state, ZIP, country)
  - Property type (e.g., Single Family, Condo, Multi-Family, Commercial)
  - Property usage (Primary Residence, Secondary Residence, Investment)
  - Year built
  - Asking price
  - Current ownership status (Owned outright, Mortgaged)
  - Number of bedrooms
  - Number of bathrooms
  - Total square footage
  - Property description

### AC-3: Validate required fields
- Given I submit the property form,
- When any required field is missing,
- Then the system should display inline validation errors and prevent submission.

### AC-4: Save and list property
- Given all required fields are filled,
- When I click "Save",
- Then the property should be saved and visible in my property listings.

---

## Out of Scope

- Property appraisal and valuation workflow
- Document upload for title deeds or appraisal reports
- Lien and encumbrance tracking
- Automated property valuation (AVM) integration

---

## Notes

- Asking price entered by the seller is not a formal appraisal; valuation is handled separately by the lender.
- A seller may add multiple properties to their profile.
- Address validation (e.g., USPS lookup) is a future enhancement.

---

## Dependencies

- Seller must have a registered and verified account before adding a property.
- Property types and usage enums should be configurable via system settings.

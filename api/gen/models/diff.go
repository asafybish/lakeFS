// Code generated by go-swagger; DO NOT EDIT.

package models

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"encoding/json"

	"github.com/go-openapi/errors"
	strfmt "github.com/go-openapi/strfmt"
	"github.com/go-openapi/swag"
	"github.com/go-openapi/validate"
)

// Diff diff
// swagger:model diff
type Diff struct {

	// direction
	// Enum: [LEFT RIGHT CONFLICT]
	Direction string `json:"direction,omitempty"`

	// path
	Path string `json:"path,omitempty"`

	// path type
	// Enum: [TREE OBJECT]
	PathType string `json:"path_type,omitempty"`

	// type
	// Enum: [ADDED REMOVED CHANGED]
	Type string `json:"type,omitempty"`
}

// Validate validates this diff
func (m *Diff) Validate(formats strfmt.Registry) error {
	var res []error

	if err := m.validateDirection(formats); err != nil {
		res = append(res, err)
	}

	if err := m.validatePathType(formats); err != nil {
		res = append(res, err)
	}

	if err := m.validateType(formats); err != nil {
		res = append(res, err)
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}

var diffTypeDirectionPropEnum []interface{}

func init() {
	var res []string
	if err := json.Unmarshal([]byte(`["LEFT","RIGHT","CONFLICT"]`), &res); err != nil {
		panic(err)
	}
	for _, v := range res {
		diffTypeDirectionPropEnum = append(diffTypeDirectionPropEnum, v)
	}
}

const (

	// DiffDirectionLEFT captures enum value "LEFT"
	DiffDirectionLEFT string = "LEFT"

	// DiffDirectionRIGHT captures enum value "RIGHT"
	DiffDirectionRIGHT string = "RIGHT"

	// DiffDirectionCONFLICT captures enum value "CONFLICT"
	DiffDirectionCONFLICT string = "CONFLICT"
)

// prop value enum
func (m *Diff) validateDirectionEnum(path, location string, value string) error {
	if err := validate.Enum(path, location, value, diffTypeDirectionPropEnum); err != nil {
		return err
	}
	return nil
}

func (m *Diff) validateDirection(formats strfmt.Registry) error {

	if swag.IsZero(m.Direction) { // not required
		return nil
	}

	// value enum
	if err := m.validateDirectionEnum("direction", "body", m.Direction); err != nil {
		return err
	}

	return nil
}

var diffTypePathTypePropEnum []interface{}

func init() {
	var res []string
	if err := json.Unmarshal([]byte(`["TREE","OBJECT"]`), &res); err != nil {
		panic(err)
	}
	for _, v := range res {
		diffTypePathTypePropEnum = append(diffTypePathTypePropEnum, v)
	}
}

const (

	// DiffPathTypeTREE captures enum value "TREE"
	DiffPathTypeTREE string = "TREE"

	// DiffPathTypeOBJECT captures enum value "OBJECT"
	DiffPathTypeOBJECT string = "OBJECT"
)

// prop value enum
func (m *Diff) validatePathTypeEnum(path, location string, value string) error {
	if err := validate.Enum(path, location, value, diffTypePathTypePropEnum); err != nil {
		return err
	}
	return nil
}

func (m *Diff) validatePathType(formats strfmt.Registry) error {

	if swag.IsZero(m.PathType) { // not required
		return nil
	}

	// value enum
	if err := m.validatePathTypeEnum("path_type", "body", m.PathType); err != nil {
		return err
	}

	return nil
}

var diffTypeTypePropEnum []interface{}

func init() {
	var res []string
	if err := json.Unmarshal([]byte(`["ADDED","REMOVED","CHANGED"]`), &res); err != nil {
		panic(err)
	}
	for _, v := range res {
		diffTypeTypePropEnum = append(diffTypeTypePropEnum, v)
	}
}

const (

	// DiffTypeADDED captures enum value "ADDED"
	DiffTypeADDED string = "ADDED"

	// DiffTypeREMOVED captures enum value "REMOVED"
	DiffTypeREMOVED string = "REMOVED"

	// DiffTypeCHANGED captures enum value "CHANGED"
	DiffTypeCHANGED string = "CHANGED"
)

// prop value enum
func (m *Diff) validateTypeEnum(path, location string, value string) error {
	if err := validate.Enum(path, location, value, diffTypeTypePropEnum); err != nil {
		return err
	}
	return nil
}

func (m *Diff) validateType(formats strfmt.Registry) error {

	if swag.IsZero(m.Type) { // not required
		return nil
	}

	// value enum
	if err := m.validateTypeEnum("type", "body", m.Type); err != nil {
		return err
	}

	return nil
}

// MarshalBinary interface implementation
func (m *Diff) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *Diff) UnmarshalBinary(b []byte) error {
	var res Diff
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}

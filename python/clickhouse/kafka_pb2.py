# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: format_schemas/kafka.proto
import sys

from pyparsing import unicode

_b = sys.version_info[0] < 3 and (lambda x: x) or (lambda x: x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection

# @@protoc_insertion_point(imports)


DESCRIPTOR = _descriptor.FileDescriptor(
    name='format_schemas/kafka.proto',
    package='',
    serialized_pb=_b(
        '\n\x1a\x66ormat_schemas/kafka.proto\"*\n\x0cKeyValuePair\x12\x0b\n\x03key\x18\x01 \x02(\x04\x12\r\n\x05value\x18\x02 \x02(\t'))

_KEYVALUEPAIR = _descriptor.Descriptor(
    name='KeyValuePair',
    full_name='KeyValuePair',
    filename=None,
    file=DESCRIPTOR,
    containing_type=None,
    fields=[
        _descriptor.FieldDescriptor(
            name='key', full_name='KeyValuePair.key', index=0,
            number=1, type=4, cpp_type=4, label=2,
            has_default_value=False, default_value=0,
            message_type=None, enum_type=None, containing_type=None,
            is_extension=False, extension_scope=None,
            options=None),
        _descriptor.FieldDescriptor(
            name='value', full_name='KeyValuePair.value', index=1,
            number=2, type=9, cpp_type=9, label=2,
            has_default_value=False, default_value=_b("").decode("utf-8"),
            message_type=None, enum_type=None, containing_type=None,
            is_extension=False, extension_scope=None,
            options=None),
    ],
    extensions=[
    ],
    nested_types=[],
    enum_types=[
    ],
    options=None,
    is_extendable=False,
    extension_ranges=[],
    serialized_start=30,
    serialized_end=72,
)

DESCRIPTOR.message_types_by_name['KeyValuePair'] = _KEYVALUEPAIR


class KeyValuePair(_message.Message,metaclass = _reflection.GeneratedProtocolMessageType):
    DESCRIPTOR = _KEYVALUEPAIR

    # @@protoc_insertion_point(class_scope:KeyValuePair)

# @@protoc_insertion_point(module_scope)
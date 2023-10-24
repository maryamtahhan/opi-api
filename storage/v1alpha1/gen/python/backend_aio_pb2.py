# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: backend_aio.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
import opicommon_pb2 as opicommon__pb2
import uuid_pb2 as uuid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x11\x62\x61\x63kend_aio.proto\x12\x12opi_api.storage.v1\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x0fopicommon.proto\x1a\nuuid.proto\"\xe4\x01\n\tAioVolume\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08\x12\x17\n\nblock_size\x18\x02 \x01(\x03\x42\x03\xe0\x41\x01\x12\x19\n\x0c\x62locks_count\x18\x03 \x01(\x03\x42\x03\xe0\x41\x01\x12*\n\x04uuid\x18\x04 \x01(\x0b\x32\x17.opi_api.common.v1.UuidB\x03\xe0\x41\x01\x12\x15\n\x08\x66ilename\x18\x05 \x01(\tB\x03\xe0\x41\x02:M\xea\x41J\n\x1copi_api.storage.v1/AioVolume\x12\x13\x61ioVolumes/{volume}*\naioVolumes2\taioVolume\"l\n\x16\x43reateAioVolumeRequest\x12\x36\n\naio_volume\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.AioVolumeB\x03\xe0\x41\x02\x12\x1a\n\raio_volume_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\"h\n\x16\x44\x65leteAioVolumeRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/AioVolume\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xa2\x01\n\x16UpdateAioVolumeRequest\x12\x36\n\naio_volume\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.AioVolumeB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"~\n\x15ListAioVolumesRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\x12\x1copi_api.storage.v1/AioVolume\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"e\n\x16ListAioVolumesResponse\x12\x32\n\x0b\x61io_volumes\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.AioVolume\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"I\n\x13GetAioVolumeRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/AioVolume\"K\n\x15StatsAioVolumeRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/AioVolume\"H\n\x16StatsAioVolumeResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats2\x8b\x07\n\x10\x41ioVolumeService\x12\x9b\x01\n\x0f\x43reateAioVolume\x12*.opi_api.storage.v1.CreateAioVolumeRequest\x1a\x1d.opi_api.storage.v1.AioVolume\"=\x82\xd3\xe4\x93\x02\x1c\"\x0e/v1/aioVolumes:\naio_volume\xda\x41\x18\x61io_volume,aio_volume_id\x12}\n\x0f\x44\x65leteAioVolume\x12*.opi_api.storage.v1.DeleteAioVolumeRequest\x1a\x16.google.protobuf.Empty\"&\x82\xd3\xe4\x93\x02\x19*\x17/v1/{name=aioVolumes/*}\xda\x41\x04name\x12\xad\x01\n\x0fUpdateAioVolume\x12*.opi_api.storage.v1.UpdateAioVolumeRequest\x1a\x1d.opi_api.storage.v1.AioVolume\"O\x82\xd3\xe4\x93\x02\x30\x32\"/v1/{aio_volume.name=aioVolumes/*}:\naio_volume\xda\x41\x16\x61io_volume,update_mask\x12\x91\x01\n\x0eListAioVolumes\x12).opi_api.storage.v1.ListAioVolumesRequest\x1a*.opi_api.storage.v1.ListAioVolumesResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12~\n\x0cGetAioVolume\x12\'.opi_api.storage.v1.GetAioVolumeRequest\x1a\x1d.opi_api.storage.v1.AioVolume\"&\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{name=aioVolumes/*}\xda\x41\x04name\x12\x95\x01\n\x0eStatsAioVolume\x12).opi_api.storage.v1.StatsAioVolumeRequest\x1a*.opi_api.storage.v1.StatsAioVolumeResponse\",\x82\xd3\xe4\x93\x02\x1f\x12\x1d/v1/{name=aioVolumes/*}:stats\xda\x41\x04nameB^\n\x12opi_api.storage.v1B\x0f\x42\x61\x63kendAioProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'backend_aio_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\017BackendAioProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _AIOVOLUME.fields_by_name['name']._options = None
  _AIOVOLUME.fields_by_name['name']._serialized_options = b'\340A\010'
  _AIOVOLUME.fields_by_name['block_size']._options = None
  _AIOVOLUME.fields_by_name['block_size']._serialized_options = b'\340A\001'
  _AIOVOLUME.fields_by_name['blocks_count']._options = None
  _AIOVOLUME.fields_by_name['blocks_count']._serialized_options = b'\340A\001'
  _AIOVOLUME.fields_by_name['uuid']._options = None
  _AIOVOLUME.fields_by_name['uuid']._serialized_options = b'\340A\001'
  _AIOVOLUME.fields_by_name['filename']._options = None
  _AIOVOLUME.fields_by_name['filename']._serialized_options = b'\340A\002'
  _AIOVOLUME._options = None
  _AIOVOLUME._serialized_options = b'\352AJ\n\034opi_api.storage.v1/AioVolume\022\023aioVolumes/{volume}*\naioVolumes2\taioVolume'
  _CREATEAIOVOLUMEREQUEST.fields_by_name['aio_volume']._options = None
  _CREATEAIOVOLUMEREQUEST.fields_by_name['aio_volume']._serialized_options = b'\340A\002'
  _CREATEAIOVOLUMEREQUEST.fields_by_name['aio_volume_id']._options = None
  _CREATEAIOVOLUMEREQUEST.fields_by_name['aio_volume_id']._serialized_options = b'\340A\001'
  _DELETEAIOVOLUMEREQUEST.fields_by_name['name']._options = None
  _DELETEAIOVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/AioVolume'
  _DELETEAIOVOLUMEREQUEST.fields_by_name['allow_missing']._options = None
  _DELETEAIOVOLUMEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATEAIOVOLUMEREQUEST.fields_by_name['aio_volume']._options = None
  _UPDATEAIOVOLUMEREQUEST.fields_by_name['aio_volume']._serialized_options = b'\340A\002'
  _UPDATEAIOVOLUMEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEAIOVOLUMEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATEAIOVOLUMEREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATEAIOVOLUMEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LISTAIOVOLUMESREQUEST.fields_by_name['parent']._options = None
  _LISTAIOVOLUMESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\022\034opi_api.storage.v1/AioVolume'
  _LISTAIOVOLUMESREQUEST.fields_by_name['page_size']._options = None
  _LISTAIOVOLUMESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTAIOVOLUMESREQUEST.fields_by_name['page_token']._options = None
  _LISTAIOVOLUMESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETAIOVOLUMEREQUEST.fields_by_name['name']._options = None
  _GETAIOVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/AioVolume'
  _STATSAIOVOLUMEREQUEST.fields_by_name['name']._options = None
  _STATSAIOVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/AioVolume'
  _AIOVOLUMESERVICE.methods_by_name['CreateAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['CreateAioVolume']._serialized_options = b'\202\323\344\223\002\034\"\016/v1/aioVolumes:\naio_volume\332A\030aio_volume,aio_volume_id'
  _AIOVOLUMESERVICE.methods_by_name['DeleteAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['DeleteAioVolume']._serialized_options = b'\202\323\344\223\002\031*\027/v1/{name=aioVolumes/*}\332A\004name'
  _AIOVOLUMESERVICE.methods_by_name['UpdateAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['UpdateAioVolume']._serialized_options = b'\202\323\344\223\00202\"/v1/{aio_volume.name=aioVolumes/*}:\naio_volume\332A\026aio_volume,update_mask'
  _AIOVOLUMESERVICE.methods_by_name['ListAioVolumes']._options = None
  _AIOVOLUMESERVICE.methods_by_name['ListAioVolumes']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _AIOVOLUMESERVICE.methods_by_name['GetAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['GetAioVolume']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{name=aioVolumes/*}\332A\004name'
  _AIOVOLUMESERVICE.methods_by_name['StatsAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['StatsAioVolume']._serialized_options = b'\202\323\344\223\002\037\022\035/v1/{name=aioVolumes/*}:stats\332A\004name'
  _AIOVOLUME._serialized_start=249
  _AIOVOLUME._serialized_end=477
  _CREATEAIOVOLUMEREQUEST._serialized_start=479
  _CREATEAIOVOLUMEREQUEST._serialized_end=587
  _DELETEAIOVOLUMEREQUEST._serialized_start=589
  _DELETEAIOVOLUMEREQUEST._serialized_end=693
  _UPDATEAIOVOLUMEREQUEST._serialized_start=696
  _UPDATEAIOVOLUMEREQUEST._serialized_end=858
  _LISTAIOVOLUMESREQUEST._serialized_start=860
  _LISTAIOVOLUMESREQUEST._serialized_end=986
  _LISTAIOVOLUMESRESPONSE._serialized_start=988
  _LISTAIOVOLUMESRESPONSE._serialized_end=1089
  _GETAIOVOLUMEREQUEST._serialized_start=1091
  _GETAIOVOLUMEREQUEST._serialized_end=1164
  _STATSAIOVOLUMEREQUEST._serialized_start=1166
  _STATSAIOVOLUMEREQUEST._serialized_end=1241
  _STATSAIOVOLUMERESPONSE._serialized_start=1243
  _STATSAIOVOLUMERESPONSE._serialized_end=1315
  _AIOVOLUMESERVICE._serialized_start=1318
  _AIOVOLUMESERVICE._serialized_end=2225
# @@protoc_insertion_point(module_scope)

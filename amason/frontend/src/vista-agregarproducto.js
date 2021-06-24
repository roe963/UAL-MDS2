import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaAgregarproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;">
 <vaadin-text-field label="Nombre" id="textField-nombre"></vaadin-text-field>
 <h5>Categoría</h5>
 <vaadin-vertical-layout theme="spacing" id="layout-selectCategoria">
  <vaadin-select value="Item one" id="select-categoria">
   <template>
    <vaadin-list-box>
     <vaadin-item selected>
       Item one 
     </vaadin-item>
     <vaadin-item>
       Item two 
     </vaadin-item>
     <vaadin-item>
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
 </vaadin-vertical-layout>
 <vaadin-text-field label="Precio" id="textField-precio"></vaadin-text-field>
 <vaadin-text-area label="Descripción" placeholder="" id="textArea-descripcion"></vaadin-text-area>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-text-field label="Imagen 1" id="textField-imagen1" style="flex-grow: 0; width: 18%;"></vaadin-text-field>
  <vaadin-text-field label="Imagen 2" id="textField-imagen2" style="flex-grow: 0; width: 18%;"></vaadin-text-field>
  <vaadin-text-field label="Imagen 3" id="textField-imagen3" style="width: 18%;"></vaadin-text-field>
  <vaadin-text-field label="Imagen 4" id="textField-imagen4" style="width: 18%;"></vaadin-text-field>
  <vaadin-text-field label="Imagen 5" id="textField-imagen5" style="flex-grow: 1; flex-shrink: 1; width: 18%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; flex-shrink: 1;">
  <h5 style="flex-grow: 0; margin-top: var(--lumo-space-xl);">Imágen Principal</h5>
  <vaadin-radio-group value="foo" id="vaadinRadioGroup">
   <vaadin-radio-button name="imagen1" id="radioButton-imagen1" checked>
    Imágen 1
   </vaadin-radio-button>
   <vaadin-radio-button name="imagen2" id="radioButton-imagen2">
    Imágen 2
   </vaadin-radio-button>
   <vaadin-radio-button name="imagen3" id="radioButton-imagen3">
    Imágen 3
   </vaadin-radio-button>
   <vaadin-radio-button name="imagen4" id="radioButton-imagen4">
    Imágen 4
   </vaadin-radio-button>
   <vaadin-radio-button name="imagen5" id="radioButton-imagen5">
    Imágen 5
   </vaadin-radio-button>
  </vaadin-radio-group>
 </vaadin-vertical-layout>
 <vaadin-button id="button-anadir">
  Añadir
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-agregarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregarproducto.is, VistaAgregarproducto);

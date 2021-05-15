import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-datosdecompra.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVeperfil extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); align-self: stretch; flex-grow: 1;">
  <h4>Mi cuenta</h4>
  <vaadin-horizontal-layout theme="spacing" style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); align-self: center; flex-grow: 0; padding-bottom: var(--lumo-space-xs);">
   <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);">
    <vaadin-text-field label="Nombre y Apellidos" id="textfield-nombre" style="flex-shrink: 1;"></vaadin-text-field>
    <vaadin-text-field label="Correo electrónico" name="textfield-email" id="correoElectrónico"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vlEstado"></vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vlDireccionyformaPago">
    <vista-datosdecompra style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);" id="vistaDatosdecompra"></vista-datosdecompra>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);">
    <img id="img-fotousuario" style="padding: var(--lumo-space-xl); align-self: center;">
    <vaadin-text-field label="Foto de usuario" id="textfield-fotousuario"></vaadin-text-field>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button id="button-guardar" style="align-self: center;">
    Guardar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }


    static get is() {
        return 'vista-veperfil';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVeperfil.is, VistaVeperfil);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-empresasdetransportes`
 *
 * VistaEmpresasdetransportes element.
 *
 * @customElement
 * @polymer
 */
class VistaEmpresasdetransportes extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-empresasdetransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresasdetransportes.is, VistaEmpresasdetransportes);

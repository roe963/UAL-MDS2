import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-verinformacion`
 *
 * VistaVerinformacion element.
 *
 * @customElement
 * @polymer
 */
class VistaVerinformacion extends PolymerElement {

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
        return 'vista-verinformacion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerinformacion.is, VistaVerinformacion);
